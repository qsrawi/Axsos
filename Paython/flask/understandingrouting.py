from flask import Flask
app = Flask(__name__)
@app.route('/')
def hello_world():
    return 'Hello World!'
@app.route('/dojo')
def dojo():
    return "Dojo!"
@app.route('/say/<name>')
def name(name):
    return f"my name is :{name}"
@app.route('/repeate/<times>/<name>')
def repeate(times,name):
    return f"{name}\t" * int(times)
if __name__=="__main__":
    app.run(debug=True)
