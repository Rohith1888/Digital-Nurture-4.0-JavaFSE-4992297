// src/components/ListOfPlayers.js
import React from 'react';

const ListOfPlayers = ({ players }) => (
  <ul>
    {players.map((player, index) => (
      <li key={index}>{player.name} - {player.score}</li>
    ))}
  </ul>
);

export default ListOfPlayers;
