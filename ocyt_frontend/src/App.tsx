import { useState } from "react";
import "./App.css";
import axios from "axios";
import { Diseno } from "./interface";

function App() {
  const [data, setData] = useState<Diseno[]>([]);
  const [cities, setCities] = useState([]);
  const [regions, setRegions] = useState([]);
  const [selectedCity, setSelectedCity] = useState("");
  const [selectedCity1, setSelectedCity1] = useState("");
  const [type, setType] = useState(true);

  const allPresentados = async () => {
    axios.get("http://localhost:8080/api/presentado").then((response) => {
      console.log(response);
      setData(response.data);
      setType(true);
      allCiudadesPresentados();
      allRegionesPresentados();
    });
  };

  const allCiudadesPresentados = async () => {
    axios
      .get("http://localhost:8080/api/presentado/ciudad")
      .then((response) => {
        console.log(response);
        setCities(response.data);
      });
  };

  const allCiudadesByCiudadPresentados = async (param: string) => {
    axios
      .get(`http://localhost:8080/api/presentado/by-ciudad/${param}`)
      .then((response) => {
        console.log(response);
        setData(response.data);
      });
  };

  const allRegionesPresentados = async () => {
    axios
      .get("http://localhost:8080/api/presentado/region")
      .then((response) => {
        console.log(response);
        setRegions(response.data);
      });
  };

  const allRegionesByRegionPresentados = async (param: string) => {
    axios
      .get(`http://localhost:8080/api/presentado/by-region/${param}`)
      .then((response) => {
        console.log(response);
        setData(response.data);
      });
  };

  const allConcedidos = async () => {
    axios.get("http://localhost:8080/api/concedido").then((response) => {
      console.log(response);
      setData(response.data);
      setType(false);
      allCiudadesConcedidos();
      allRegionesConcedidos();
    });
  };

  const allCiudadesConcedidos = async () => {
    axios.get("http://localhost:8080/api/concedido/ciudad").then((response) => {
      console.log(response);
      setCities(response.data);
    });
  };

  const allCiudadesByCiudadConcedidos = async (param: string) => {
    axios
      .get(`http://localhost:8080/api/concedido/by-ciudad/${param}`)
      .then((response) => {
        console.log(response);
        setData(response.data);
      });
  };

  const allRegionesConcedidos = async () => {
    axios.get("http://localhost:8080/api/concedido/region").then((response) => {
      console.log(response);
      setRegions(response.data);
    });
  };

  const allRegionesByRegionConcedidos = async (param: string) => {
    axios
      .get(`http://localhost:8080/api/concedido/by-region/${param}`)
      .then((response) => {
        console.log(response);
        setData(response.data);
      });
  };

  const handleSelectChange = (event: React.ChangeEvent<HTMLSelectElement>) => {
    const selectedValue = event.target.value;
    setSelectedCity(selectedValue);
    console.log("Valor seleccionado:", selectedValue);
    if (type) {
      allCiudadesByCiudadPresentados(selectedValue);
    } else {
      allCiudadesByCiudadConcedidos(selectedValue);
    }
  };

  const handleSelectChange1 = (event: React.ChangeEvent<HTMLSelectElement>) => {
    const selectedValue = event.target.value;
    setSelectedCity1(selectedValue);
    console.log("Valor seleccionado:", selectedValue);
    if (type) {
      allRegionesByRegionPresentados(selectedValue);
    } else {
      allRegionesByRegionConcedidos(selectedValue);
    }
  };

  return (
    <div style={{ display: "flex", flexDirection: "column", gap: "1rem" }}>
      <div style={{ display: "flex", justifyContent: "space-evenly" }}>
        <button onClick={allPresentados}>Presentados</button>
        <button onClick={allConcedidos}>Concedidos</button>
      </div>
      {cities.length > 0 && (
        <div style={{ display: "flex", justifyContent: "center", gap: "1rem" }}>
          <p>filtrar por ciudad</p>
          <select onChange={handleSelectChange} value={selectedCity}>
            {cities &&
              cities.map((city, index) => (
                <option key={index}>{cities[index]}</option>
              ))}
          </select>
        </div>
      )}
      {regions.length > 0 && (
        <div style={{ display: "flex", justifyContent: "center", gap: "1rem" }}>
          <p>filtrar por region</p>
          <select onChange={handleSelectChange1} value={selectedCity1}>
            {regions &&
              regions.map((region, index) => (
                <option key={index}>{regions[index]}</option>
              ))}
          </select>
        </div>
      )}
      <div
        style={{
          display: "grid",
          gridTemplateColumns: "1fr 1fr 1fr 1fr",
          gap: "16px",
        }}
      >
        {data.map((file, index) => (
          <div
            key={index}
            style={{
              padding: "8px",
              border: "1px solid #ccc",
              borderRadius: "8px",
            }}
          >
            {file.solicitud_ANONIMIZADA && <p>{file.solicitud_ANONIMIZADA}</p>}
            {file.solicitud && <p>{file.solicitud}</p>}
            {file.title && <p>{file.title}</p>}
            <p>{file.ano_Presentacion}</p>
            <p>{file.ciudad}</p>
            <p>{file.dimension}</p>
            <p>{file.fecha_de_Presentacion}</p>
            <p>{file.inventor}</p>
            <p>{file.pais}</p>
            <p>{file.locarno}</p>
            <p>{file.region}</p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;
