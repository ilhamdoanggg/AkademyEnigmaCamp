import React, {Component} from 'react';
import HeaderComponent from "./component/HeaderComponent";
import {Route, StaticRouter, Switch, Link, BrowserRouter as Router} from 'react-router-dom'
import ProductList from "./product/ProductList";
import ProductForm from "./product/ProductForm";
import "./style/App.css"
import ProductDetail from "./product/ProductDetail";

class App extends Component {
    constructor(props) {
        super(props);
        this.state = {
            id: '',
            productName: '',
            quantity: '',
            price: '',
            items: []
        }
    }

    handleFormSubmit = (event) => {
        event.preventDefault();
        let items = [...this.state.items];
        items.push({
            id: this.state.id,
            productName: this.state.productName,
            quantity: this.state.quantity,
            price: this.state.price
        });
        this.setState({
            items,
            id: '',
            productName: '',
            quantity: '',
            price: ''
        });
        window.alert("SUKSES")
    };
    handleInputChange = (event) => {
        let input = event.target;
        let name = event.target.name;
        let value = input.value;
        this.setState({
            [name]: value
        })
    };
    render() {
        return (
            <Router>
                <div className="App">
                    <HeaderComponent/>
                    <div className="sidenav">
                        <Link to="/product-list">Product List</Link>
                        <Link to="product-form">Product Form</Link>
                    </div>
                    <div>
                        <Switch>
                            <Route path="/product-list/:id" render={(props)=> <ProductDetail{...props} items={this.state.items}/>}/>
                            <Route exact path="/product-list">
                                <ProductList items={ this.state.items }/>
                            </Route>
                            <Route path="/product-form">
                                <ProductForm
                                    handleFormSubmit={ this.handleFormSubmit }
                                    handleInputChange={ this.handleInputChange }
                                    newId={ this.state.id }
                                    newProduct={ this.state.productName }
                                    newQuantity={this.state.quantity}
                                    newPrice={this.state.price}
                                />

                            </Route>

                        </Switch>
                    </div>
                </div>
            </Router>
        );
    }
}
export default App;
