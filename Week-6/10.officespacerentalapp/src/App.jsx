const office = {
  name: "Tech Park Office",
  rent: 55000,
  address: "Bangalore"
};

const officeSpaces = [
  {
    name: "Tech Park Office",
    rent: 55000,
    address: "Bangalore"
  },
  {
    name: "Cyber Hub",
    rent: 75000,
    address: "Hyderabad"
  },
  {
    name: "Innovation Center",
    rent: 45000,
    address: "Chennai"
  }
];

function App() {
  return (
    <div style={{ padding: "20px" }}>
      <h1>Office Space Rental App</h1>

      <img
        src="https://images.unsplash.com/photo-1497366754035-f200968a6e72?w=600"
        alt="Office Space"
        width="500"
      />

      <h2>Single Office Details</h2>

      <p><b>Name:</b> {office.name}</p>

      <p
        style={{
          color: office.rent < 60000 ? "red" : "green"
        }}
      >
        <b>Rent:</b> ₹{office.rent}
      </p>

      <p><b>Address:</b> {office.address}</p>

      <hr />

      <h2>All Office Spaces</h2>

      {officeSpaces.map((item, index) => (
        <div
          key={index}
          style={{
            border: "1px solid black",
            padding: "10px",
            marginBottom: "15px",
            width: "350px"
          }}
        >
          <h3>{item.name}</h3>

          <p
            style={{
              color: item.rent < 60000 ? "red" : "green"
            }}
          >
            <b>Rent:</b> ₹{item.rent}
          </p>

          <p><b>Address:</b> {item.address}</p>
        </div>
      ))}
    </div>
  );
}

export default App;