import React, { useState } from 'react';
import './App.css';
import { LoginButton } from './components/LoginButton';
import { LogoutButton } from './components/LogoutButton';
import { UserPage } from './components/UserGreeting';
import { GuestPage } from './components/GuestGreeting';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLoginClick = () => setIsLoggedIn(true);
  const handleLogoutClick = () => setIsLoggedIn(false);

  return (
    <div className="App">
      <h1>Ticket Booking App</h1>
      {isLoggedIn ? (
        <LogoutButton onClick={handleLogoutClick} />
      ) : (
        <LoginButton onClick={handleLoginClick} />
      )}
      <Greeting isLoggedIn={isLoggedIn} />
    </div>
  );
}

function Greeting(props) {
  if (props.isLoggedIn) {
    return <UserPage />;
  }
  return <GuestPage />;
}

export default App;
