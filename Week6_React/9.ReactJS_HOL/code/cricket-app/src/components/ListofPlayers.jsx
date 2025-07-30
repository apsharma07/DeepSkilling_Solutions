import React from "react";

const ListofPlayers = () => {
  const players = [
    { name: "Virat Kohli", score: 85 },
    { name: "Rohit Sharma", score: 90 },
    { name: "KL Rahul", score: 65 },
    { name: "Shubman Gill", score: 45 },
    { name: "Hardik Pandya", score: 75 },
    { name: "Ravindra Jadeja", score: 55 },
    { name: "R Ashwin", score: 60 },
    { name: "Mohammed Shami", score: 72 },
    { name: "Bumrah", score: 88 },
    { name: "Ishan Kishan", score: 50 },
    { name: "Surya Kumar", score: 95 },
  ];

  // Using map
  const playerList = players.map((player, index) => (
    <li key={index}>
      {player.name} - Score: {player.score}
    </li>
  ));

  // Using arrow function to filter players with score < 70
  const lowScorers = players.filter((player) => player.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>{playerList}</ul>

      <h3>Players with score below 70</h3>
      <ul>
        {lowScorers.map((player, index) => (
          <li key={index}>
            {player.name} - Score: {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
