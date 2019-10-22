import React, {Component} from "react";

class CardComponent extends Component {

    render() {
        return (
            <card>
            <div className="card">
                <label>Name : {this.props.item.name}</label>
            <br/>
                <label>Age : {this.props.item.age}</label>
            </div>
            </card>
        );
    }
}

export default CardComponent;
