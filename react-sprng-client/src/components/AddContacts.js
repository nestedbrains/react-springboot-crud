import React, { Component } from 'react';

export default class AddContacts extends Component {

    submitContact(event) {
        event.preventDefault();

        let contact = {
            name: this.refs.name.value,
            address: this.refs.address.value,
            phone: this.refs.phone.value,
            email: this.refs.email.value
        }

        fetch("http://localhost:8080/v1/api/students",
            {
                method: "POST",
                headers: {
                    "Content-Type": "application/json"
                },
                body: JSON.stringify(contact)
            })
            .then(response => response.json());

        window.location.reload();
    }

    render() {
        return (
            <div className="row">
                <form className="col s12" onSubmit={this.submitContact.bind(this)}>

                    <div className="row">
                        <div className="input-field col s12">
                            <input id="name" type="text" className="validate" />
                            <label htmlFor="name">Name</label>
                        </div>
                    </div>

                    <div className="row">
                        <div className="input-field col s12">
                            <input id="email" type="email" className="validate" />
                            <label htmlFor="email">Email</label>
                        </div>
                    </div>
                    <div className="row">
                        <div className="input-field col s12">
                            <input id="phoneNo" type="text" className="validate" />
                            <label htmlFor="phoneNo">Phone No</label>
                        </div>
                    </div>

                    <div className="row">
                        <div className="input-field col s12">
                            <input id="address" type="text" className="validate" />
                            <label htmlFor="address">Address</label>
                        </div>
                    </div>
                    <div className="row">
                        <button className="waves-effect waves-light btn " type="submit" name="action">Submit</button>
                    </div>
                </form>
            </div>
        )
    }
}