import math
from flask import Flask,render_template
app = Flask(__name__)

@app.route('/')
def board():
    return render_template("index.html") 
@app.route('/<x>')
def boardrow(x):
    return render_template("index1.html",x=int(x)) 

@app.route('/<x>/<y>')
def boardrowandcoloumn(x,y):
    x=int(x)
    y=int(y) 
    y= math.floor(y/2)
    return render_template("index2.html",rows=x,coloumns=y) 
if __name__=="__main__":
    app.run(debug=True)