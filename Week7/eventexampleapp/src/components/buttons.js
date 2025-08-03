 import React, { useState } from 'react';
 function Buttons(){
    const [number,setNumber] =  useState(0)

    const incrementValue = ()=>{
        setNumber(number+1)
        alert('Hello this is increment button')
    }
     const decrementValue = ()=>{
        setNumber(number-1)
    }
    const welcomeButton = (message)=>{
        alert(message)
    }
     const clickOnMe = ()=>{
        alert('Clicked on me')
    }


    return(
        <>
        <text id='number' style={{marginTop: '15px'}}>{number}</text>
        <br/><br/>
        <button onClick={incrementValue}>Increment</button>
        <br/>
        <button onClick={decrementValue}>Decrement</button>
        <br/>
        <button onClick={()=> welcomeButton('welcome')}>Say welcome</button>
        <br/>
        <button onClick={clickOnMe}>Click on me</button>
        </>
    )
}

export default Buttons;
