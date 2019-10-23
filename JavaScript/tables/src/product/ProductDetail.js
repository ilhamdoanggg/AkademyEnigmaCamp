import React, {Component} from "react";

class ProductDetail extends Component {
    render() {
        const param=this.state.
        return (
            <div>
                <div id="Form">
                    <h3>Add a new Product to the table</h3>
                    <label htmlFor="id">
                        Id:
                        <input id="id" type="text" name="id"/>
                    </label>
                    <label htmlFor="productName">
                        Product Name:
                        <input id="productName" type="text" name="productName"/>
                    </label>
                    <label htmlFor="quantity">
                        Quantity :
                        <input id="quantity" type="number" name="quantity"/>
                    </label>
                    <label htmlFor="price">
                        Price :
                        <input id="price" type="number" name="price"/>
                    </label>
                </div>
             </div>
        );
    }
}

export default ProductDetail;
