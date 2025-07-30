import React, { Component } from "react";

class CurrencyConverter extends Component {
  constructor() {
    super();
    this.state = {
      rupees: "",
      euro: "",
      rate: 0.011,
    };
  }

  handleChange = (event) => {
    this.setState({ rupees: event.target.value });
  };

  handleSubmit = (event) => {
    event.preventDefault(); 
    const { rupees, rate } = this.state;
    const euro = (parseFloat(rupees) * rate).toFixed(2);
    this.setState({ euro });
  };

  render() {
    return (
      <div style={{ marginTop: "30px" }}>
        <h2>Currency Converter (INR ➝ EURO)</h2>
        <form onSubmit={this.handleSubmit}>
          <label>
            Enter Rupees:
            <input
              type="number"
              value={this.state.rupees}
              onChange={this.handleChange}
              required
            />
          </label>
          <button type="submit">Convert</button>
        </form>

        {this.state.euro && (
          <p>
            ₹{this.state.rupees} = €{this.state.euro}
          </p>
        )}
      </div>
    );
  }
}

export default CurrencyConverter;
