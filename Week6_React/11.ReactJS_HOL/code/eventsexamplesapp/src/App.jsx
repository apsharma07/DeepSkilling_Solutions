import React, { Component } from "react";
import CurrencyConverter from "./CurrencyConverter";

class App extends Component {
  constructor() {
    super();
    this.state = {
      count: 0,
    };
  }
  handleIncrement = () => {
    this.setState((prevState) => ({ count: prevState.count + 1 }));
    this.sayHello();
  };

  sayHello = () => {
    console.log("Hello! This is a static message.");
  };
  handleDecrement = () => {
    this.setState((prevState) => ({ count: prevState.count - 1 }));
  };
  sayWelcome = (message) => {
    alert(message);
  };
  handlePress = (event) => {
    alert("I was clicked");
    console.log("Synthetic Event Type:", event.type); // example of synthetic event
  };
  render() {
    return (
      <div style={{ padding: "30px", fontFamily: "Arial" }}>
        <h1>React Event Examples App</h1>
        <p>Counter: {this.state.count}</p>
        <button onClick={this.handleIncrement}>Increment</button>{" "}
        <button onClick={this.handleDecrement}>Decrement</button>
        <br /><br />
        <button onClick={() => this.sayWelcome("Welcome to the Event Demo!")}>
          Say Welcome
        </button>
        <br /><br />
        <button onClick={this.handlePress}>OnPress</button>
        <br /><br />
        <CurrencyConverter />
      </div>
    );
  }
}

export default App;
