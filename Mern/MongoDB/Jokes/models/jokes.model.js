const mongoose = require("mongoose");

const JokeSchema = new mongoose.Schema({
	setup: {
		type: String,
		minlength: [10, "Setup must be at least 10 characters!"],
	  },
	  punchline: {
		type: String,
		minlength: [3, "Punchline must be at least 3 characters!"],
	  },
	});
	
	const Joke = mongoose.model("Joke", JokeSchema);
	
	module.exports = Joke;