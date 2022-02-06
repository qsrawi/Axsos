from flask import Flask,render_template,request
app=Flask(__name__)
@app.route('/')
def hello():
    return render_template("index.html")
@app.route('/result', methods=['POST'])
def create_user():
    print("Got Post Info")
    print(request.form)
    name_from_form = request.form['username']
    location_from_form = request.form['location']
    language_from_form=request.form['language']
    comment_from_form=request.form['comment']
    return render_template("result.html", name=name_from_form, location=location_from_form,language=language_from_form,comment=comment_from_form)
@app.route('/', methods=['POST'])
def go_back():
    return render_template("index.html")
if __name__=="__main__":
    app.run(debug=True)
