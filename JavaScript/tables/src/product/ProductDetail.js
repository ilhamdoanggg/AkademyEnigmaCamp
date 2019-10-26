import React, {Component} from "react";

class ProductDetail extends Component {

    constructor(props) {
        super(props);
        this.state={

        }
    }

    render() {
        let param = this.props.match.params.id;
        let detail = Object.create(this.props.items)
        let getProdusctId = {...detail.find(detail => detail.id == parseInt(param))}
        return (
            <div>
                <form id="Form" onSubmit={this.props.handleFormSubmit}>
                    <label htmlFor="id">
                        Id:
                        <input id="id" value={getProdusctId.id} type="text" name="id"/>
                    </label>
                    <label htmlFor="productName">
                        Product Name:
                        <input id="productName" value={getProdusctId.productName} type="text" name="productName"/>
                    </label>
                    <label htmlFor="quantity">
                        Quantity :
                        <input id="quantity" value={getProdusctId.quantity} type="number" name="quantity"/>
                    </label>
                    <label htmlFor="price">
                        Price :
                        <input id="price" value={getProdusctId.price} type="number" name="price"/>
                    </label>
                    <button type="submit" value="Submit">Change data</button>
                </form>
             </div>
        );
    }
}

export default ProductDetail;
