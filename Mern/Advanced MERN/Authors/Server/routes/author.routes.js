const AuthorController = require('../controllers/author.controller');
module.exports = function(app){
    app.post('/api/author', AuthorController.createAuthor);
    app.get('/api/author', AuthorController.getAllAuthors);
    app.get('/api/author/:id', AuthorController.getAuthor);
    app.delete('/api/author/:id',AuthorController.deleteAnExistingAuthor)
    app.put('/api/author/:id', AuthorController.updateAuthor);
}