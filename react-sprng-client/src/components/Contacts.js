import React, { Component } from 'react';
import AddContacts from './AddContacts';
import SingleContact from './SingleContact';

class Contacts extends Component {
    constructor(props) {
        super(props);
        this.state = {
            contacts: []
        };
    }
    componentDidMount() {
        fetch("http://localhost:8080/v1/api/students")
            .then(response => response.json())
            .then(data => this.setState({ contacts: data }))
    }

    render() {
        return (
            <div>
                <div className="row">
                    <AddContacts />
                </div>

                <div className="row">
                    {this.state.contacts.map((item) => (
                        <SingleContact key={item.id} item={item} />
                    ))}
                </div>
            </div>
        )
    }
}
export default Contacts;
