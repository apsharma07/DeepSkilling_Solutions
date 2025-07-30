import React from "react";

function App() {
  const office = {
    name: "Cozy Workspace",
    rent: 45000,
    address: "123 Tech Park, Bangalore",
    image: "https://t4.ftcdn.net/jpg/03/84/55/29/360_F_384552930_zPoe9zgmCF7qgt8fqSedcyJ6C6Ye3dFs.jpg",
  };
  const offices = [
    {
      name: "Startup Hub",
      rent: 40000,
      address: "11 MG Road, Mumbai",
    },
    {
      name: "Corporate Tower",
      rent: 75000,
      address: "25 Cyber City, Gurgaon",
    },
    {
      name: "Smart Office",
      rent: 58000,
      address: "78 Hitech City, Hyderabad",
    },
  ];
  const headingStyle = {
    textAlign: "center",
    marginTop: "20px",
    color: "#2c3e50",
  };

  return (
    <div className="App">
      <h1 style={headingStyle}>Office Space Rental App</h1>

      {/* Office Image */}
      <img
        src={office.image}
        alt="Office"
        style={{ display: "block", margin: "20px auto" }}
      />
      <div style={{ textAlign: "center" }}>
        <h2>{office.name}</h2>
        <p style={{ color: office.rent < 60000 ? "red" : "green" }}>
          Rent: ₹{office.rent}
        </p>
        <p>{office.address}</p>
      </div>
      <div style={{ padding: "20px" }}>
        <h2 style={{ textAlign: "center" }}>More Office Spaces</h2>
        {offices.map((item, index) => (
          <div
            key={index}
            style={{
              border: "1px solid #ccc",
              borderRadius: "10px",
              padding: "15px",
              marginBottom: "10px",
            }}
          >
            <h3>{item.name}</h3>
            <p style={{ color: item.rent < 60000 ? "red" : "green" }}>
              Rent: ₹{item.rent}
            </p>
            <p>{item.address}</p>
          </div>
        ))}
      </div>
    </div>
  );
}

export default App;
