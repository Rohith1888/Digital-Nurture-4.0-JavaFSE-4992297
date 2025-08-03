import React, { useState } from 'react';

function CurrencyConverter() {
  const [amount, setAmount] = useState('');
  const [converted, setConverted] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault(); 
    const euro = parseFloat(amount);

    if (isNaN(euro)) {
      alert("Please enter a valid number");
      return;
    }

    const inrRate = 91.5; 
    const inr = euro * inrRate;
    setConverted(inr.toFixed(2) + " INR");
  };

  return (
    <>
      <h1 style={{ color: "Green" }}>Currency Converter !!</h1>
      <br />
      <form onSubmit={handleSubmit}>
        <label htmlFor="amount">Amount (EUR): </label>
        <input
          type="text"
          id="amount"
          value={amount}
          onChange={(e) => setAmount(e.target.value)}
        />
        <br /><br />
        <label htmlFor="currency">Converted (INR): </label>
        <textarea
          id="currency"
          value={converted}
          readOnly
        />
        <br /><br />
        <button type="submit" style={{ marginLeft: '100px' }}>Convert</button>
      </form>
    </>
  );
}

export default CurrencyConverter;
