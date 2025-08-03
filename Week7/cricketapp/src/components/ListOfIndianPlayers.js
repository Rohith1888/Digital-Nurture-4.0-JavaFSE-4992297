import React from 'react';

const ListOfIndianPlayers = ({ IndianPlayers }) => (
  <ul>
    {IndianPlayers.map((player, index) => (
      <li key={index}>{player}</li>
    ))}
  </ul>
);

export default ListOfIndianPlayers;
