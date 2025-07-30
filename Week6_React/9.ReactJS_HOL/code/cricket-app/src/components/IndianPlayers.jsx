import React from "react";

const IndianPlayers = () => {
  const teamPlayers = ["Player1", "Player2", "Player3", "Player4", "Player5", "Player6"];

  const [odd1, even1, odd2, even2, odd3, even3] = teamPlayers;
  const T20players = ["Virat", "Rohit", "Surya"];
  const RanjiTrophy = ["Shreyas", "Rahane", "Pujara"];

  const allPlayers = [...T20players, ...RanjiTrophy];

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        <li>{odd1}</li>
        <li>{odd2}</li>
        <li>{odd3}</li>
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        <li>{even1}</li>
        <li>{even2}</li>
        <li>{even3}</li>
      </ul>

      <h2>Merged Players List</h2>
      <ul>
        {allPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
