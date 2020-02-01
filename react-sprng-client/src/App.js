import React from 'react';
import Contacts from './components/Contacts'

function App() {
  return (
    <div className="container">
      <nav>
        <div>
          <div className="nav-wrapper center-align">
            <a href="/" className="brand-logo">Contacts</a>
          </div>
        </div>
      </nav>
      <div className="row">
        <Contacts />
      </div>
    </div>
  );
}

export default App;
