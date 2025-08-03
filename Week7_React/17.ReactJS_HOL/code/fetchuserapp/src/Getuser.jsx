// src/Getuser.js
import React, { Component } from "react";

class Getuser extends Component {
  constructor(props) {
    super(props);
    this.state = {
      user: null,
    };
  }

  async componentDidMount() {
    try {
      const response = await fetch("https://api.randomuser.me/");
      const data = await response.json();
      this.setState({ user: data.results[0] });
    } catch (error) {
      console.error("Error fetching user:", error);
    }
  }

  render() {
    const { user } = this.state;

    return (
      <div style={{ textAlign: "center", marginTop: "50px" }}>
        <h2>Random User Info</h2>
        {user ? (
          <div>
            <p><strong>Title:</strong> {user.name.title}</p>
            <p><strong>First Name:</strong> {user.name.first}</p>
            <img src={user.picture.large} alt="User" style={{ borderRadius: "50%" }} />
          </div>
        ) : (
          <p>Loading user data...</p>
        )}
      </div>
    );
  }
}

export default Getuser;
