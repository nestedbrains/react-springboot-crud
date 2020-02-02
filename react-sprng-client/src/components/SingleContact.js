import React from 'react';

const SingleContact = ({ item }) => {

    return (
        <div className="col s12 m6 l3">

        <a class="btn tooltipped" href="/" data-position="top" data-tooltip="Edit"><i class="material-icons">edit</i></a>
    <div className="card blue-grey">
        <div className="card-content white-text">
        <span className="card-title">{item.name}</span>
    </div>
    <div className="card-action">
        <p>{item.email}</p>
    </div>
    </div>
    </div>

)
};

export default SingleContact;