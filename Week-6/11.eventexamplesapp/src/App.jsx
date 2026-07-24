import { useState } from "react";

function App() {

  const [count, setCount] = useState(0);
  const [amount, setAmount] = useState("");
  const [currency, setCurrency] = useState("");

  // Increment
  const increment = () => {
    setCount(count + 1);
  };

  // Decrement
  const decrement = () => {
    setCount(count - 1);
  };

  // Hello Message
  const sayHello = () => {
    alert("Hello! Member1");
  };

  // Multiple Methods
  const handleIncrement = () => {
    increment();
    sayHello();
  };

  // Welcome
  const sayWelcome = (msg) => {
    alert(msg);
  };

  // Synthetic Event
  const handleClick = () => {
    alert("I was clicked");
  };

  // Currency Converter
  const handleSubmit = (e) => {
    e.preventDefault();

    const euro = Number(amount) / 90;

    alert(`Converting to Euro Amount is ${euro.toFixed(2)}`);
  };

  return (
    <div style={{ padding: "20px" }}>

      <h2>{count}</h2>

      <button onClick={handleIncrement}>Increment</button>
      <br /><br />

      <button onClick={decrement}>Decrement</button>
      <br /><br />

      <button onClick={() => sayWelcome("Welcome")}>
        Say Welcome
      </button>

      <br /><br />

      <button onClick={handleClick}>
        Click on me
      </button>

      <br /><br /><br />

      <h1 style={{ color: "green" }}>
        Currency Convertor!!!
      </h1>

      <form onSubmit={handleSubmit}>

        <label>Amount: </label>

        <input
          type="number"
          value={amount}
          onChange={(e) => setAmount(e.target.value)}
        />

        <br /><br />

        <label>Currency: </label>

        <input
          type="text"
          value={currency}
          onChange={(e) => setCurrency(e.target.value)}
        />

        <br /><br />

        <button type="submit">
          Submit
        </button>

      </form>

    </div>
  );
}

export default App;