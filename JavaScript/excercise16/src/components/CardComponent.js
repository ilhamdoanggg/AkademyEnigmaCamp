import React, {Component} from "react";

class CardComponent extends Component {

    render() {
        return (
            <card>
            <div className="card">
                <h1>{this.props.item.name}</h1>
                <h1>{this.props.item.age}</h1>
            </div>
            </card>
        );
    }
}

export default CardComponent;
