
import React from 'react';
import ListOfPlayers from './components/ListOfPlayers';
import ScoreBelow70 from './components/ScoreBelow70';
import { OddPlayers, EvenPlayers, IndianPlayersList } from './components/IndianPlayers';
import ListOfIndianPlayers from './components/ListOfIndianPlayers';

const App = () => {
  const flag = true;  //change to true

  const players = [
    { name: 'Virat Kohli', score: 85 },
    { name: 'Rohit Sharma', score: 45 },
    { name: 'Hardik Pandya', score: 60 },
    { name: 'Shubman Gill', score: 75 },
    { name: 'MS Dhoni', score: 50 },
    { name: 'Rishabh Pant', score: 90 },
    { name: 'Suryakumar Yadav', score: 30 },
    { name: 'Ravindra Jadeja', score: 100 },
    { name: 'Mohammed Shami', score: 65 },
    { name: 'Jasprit Bumrah', score: 95 },
    { name: 'Yuzvendra Chahal', score: 20 }
  ];

  const IndianTeam = IndianPlayersList;

  if (flag === true) {
    return (
      <div>
        <h1>List of Players</h1>
        <ListOfPlayers players={players} />
        <hr />
        <h1>List of Players having Scores Less than 70</h1>
        <ScoreBelow70 players={players} />
      </div>
    );
  } else {
    return (
      <div>
        <div>
          <h1>Indian Team</h1>
          <h2>Odd Players</h2>
          <OddPlayers players={IndianTeam} />
          <hr />
          <h2>Even Players</h2>
          <EvenPlayers players={IndianTeam} />
        </div>
        <hr />
        <div>
          <h2>List of Indian Players Merged:</h2>
          <ListOfIndianPlayers IndianPlayers={IndianTeam} />
        </div>
      </div>
    );
  }
};

export default App;
