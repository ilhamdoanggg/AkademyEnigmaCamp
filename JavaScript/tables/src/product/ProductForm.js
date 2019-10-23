import React, {Component} from 'react';

class ProductForm extends Component{
    render() {
        return (
            <div id="Form">
                <h3>Add a new Product to the table</h3>
                <form onSubmit={this.props.handleFormSubmit}>
                    <label htmlFor="id">
                        Id:
                        <input id="id" value={this.props.newId} type="text" name="id"
                               onChange={this.props.handleInputChange}/>
                    </label>
                    <label htmlFor="productName">
                        Product Name:
                        <input id="productName" value={this.props.newProductName} type="text" name="productName"
                               onChange={this.props.handleInputChange}/>
                    </label>
                    <label htmlFor="quantity">
                        Quantity :
                        <input id="quantity" value={this.props.newQuantity} type="number" name="quantity"
                               onChange={this.props.handleInputChange}/>
                    </label>
                    <label htmlFor="price">
                        Price :
                        <input id="price" value={this.props.newPrice} type="number" name="price"
                               onChange={this.props.handleInputChange}/>
                    </label>
                    <button type="submit" value="Submit">Add Item</button>
                </form>
            </div>
        );
    }
}
export default ProductForm;
