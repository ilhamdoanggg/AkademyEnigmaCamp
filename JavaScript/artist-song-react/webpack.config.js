var path    = require('path');
var hwp     = require('html-webpack-plugin');

module.exports = {
    // entry: path.join(__dirname, '/src/index.js'),
    // output: {
    //     filename: 'build.js',
    //     path: path.join(__dirname, '/dist')
    // },
    // module:{
    //     rules:[{
    //         exclude: /node_modules/,
    //         test: /\.js$/,
    //         loader: 'babel-loader'
    //     }]
    // },
    devServer: {
        contentBase: 'http://localhost',
        port: 9090,
        // Send API requests on localhost to API server get around CORS.
        proxy: {
           '/api': {
              target: {
                 host: "localhost",
                 protocol: 'http:',
                 port: 3000
              }
           }
      },
    plugins:[
        new hwp({template:path.join(__dirname, '/src/index.html')})
        ]
    }
}
