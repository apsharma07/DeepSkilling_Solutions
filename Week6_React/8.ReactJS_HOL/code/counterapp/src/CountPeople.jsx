// src/CountPeople.jsx
import React, { Component } from 'react';

class CountPeople extends Component {
  constructor(props) {
    super(props);
    this.state = {
      entryCount: 0,
      exitCount: 0
    };

    // Bind the methods
    this.updateEntry = this.updateEntry.bind(this);
    this.updateExit = this.updateExit.bind(this);
  }

  updateEntry() {
    this.setState((prevState) => ({
      entryCount: prevState.entryCount + 1
    }));
  }

  updateExit() {
    this.setState((prevState) => ({
      exitCount: prevState.exitCount + 1
    }));
  }

  render() {
    return (
      <div className="counter-container">
        <h1>Mall Counter</h1>
        <h2>People Entered: {this.state.entryCount}</h2>
        <h2>People Exited: {this.state.exitCount}</h2>

        <button onClick={this.updateEntry}>Login</button>
        <button onClick={this.updateExit}>Exit</button>
      </div>
    );
  }
}

export default CountPeople;
