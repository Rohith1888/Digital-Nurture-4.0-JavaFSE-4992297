import './App.css';

function App() {
  const officeSpaces = [
    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image: "https://officesnapshots.com/wp-content/uploads/2020/07/dbs-bank-offices-hyderabad-12.jpg",
    },
    {
      Name: "Regus",
      Rent: 70000,
      Address: "Bangalore",
      Image: "https://officesnapshots.com/wp-content/uploads/2019/07/regus-management-offices-hamburg-3.jpg",
    },
  ];

  const element = "Office Space";

  return (
    <>
      <h1>{element}, at Affordable Range</h1>
      <div className='office'>
        {
          officeSpaces.map((item, index) => {
            let rentColor = item.Rent <= 60000 ? 'textRed' : 'textGreen';

            return (
              <div key={index} className="office">
                <img src={item.Image} width="25%" height="25%" alt="Office Space" />
                <h1>Name: {item.Name}</h1>
                <h3 className={rentColor}>Rent: Rs. {item.Rent}</h3>
                <h3>Address: {item.Address}</h3>
              </div>
            );
          })
        }
      </div>
    </>
  );
}

export default App;
