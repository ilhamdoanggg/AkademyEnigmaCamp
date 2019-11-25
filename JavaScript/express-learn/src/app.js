import express from 'express'

const app = express()
const port = 3000;

let handleRequest = (req, res) => {
    res.send(`<h1>request ${req.method} to ${req.originalUrl},
 content ${req.body} , params ${req.params.name}, query ${req.query.name} </h1>`)
}

let handleNotFound = (req, res) => {
    res.status(404).send(`<center><h1>THERE IS NOTHING HERE</h1></center>`)}

let handleUser=(req, res)=>{
    res.send(`<h1>params ${req.params.username}, query ${req.query.username} </h1>`)}

let handelCategory=(req, res)=>{
    const {body, params, query}= req
    res.json({message: `request ${req.method} to ${req.originalUrl}`,
        query,
        params,
        body
    })}

let handleTrainRoutes=(req, res)=>{
    res.send(`<h1>request ${req.method} to ${req.originalUrl},
    content ${req.body} , params ${req.params}, query ${req.query} </h1>`)}

app.use(express.json())
app.use(express.urlencoded())

app.get('/', handleRequest)
app.get('/hello.json', (req, res) => res.json({hello: 'express!', salam: 'jajajjaj'}))

app.get('/hello/:name', handleRequest)
app.get('/hello/', handleRequest)
app.post('/hello', handleRequest)
app.put('/hello', handleRequest)
app.patch('/hello', handleRequest)
app.delete('/hello', handleRequest)



//app.get( '/users/:id(\\d+)/', handelCategory)
app.get( '/users/:id([0-9]+)/', handelCategory)
app.get('/users/:gender(male|female)', handelCategory)
app.get('/users/:username?', handelCategory)
app.get('/posts/:category?', handelCategory)
app.get('/train/routes/', handelCategory)
//app.get('/username/')
//app.get('/train/routes/',handleTrainRoutes)
app.use(handleNotFound)

app.listen(port, () => {
    console.log(`my app listening on port ${port}!`);
});
