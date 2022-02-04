from flask import Flask,render_template
app = Flask(__name__)
@app.route('/')
def hello_world():
    return 'Hello World!'
@app.route('/play')
def play(x):
    return render_template("index1.html",x=3)
@app.route('/play/<x>')
def playtimes(x):
    return render_template("index2.html",x=int(x))
@app.route('/play/<x>/<color>')
def colors(x,color):
    return render_template("index3.html",x=int(x),color=color)
if __name__=="__main__":
    app.run(debug=True)
