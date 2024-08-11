'''from tkinter import *
from tkinter.ttk import *

# writing code needs to
# create the main window of
# the application creating
# main window object named root
vin = Tk()

# giving title to the main window
vin.title("Basic_Program")

# Label is what output will be
# show on the window
label = Label(vin, text ="Hello World !").pack()

# calling mainloop method which is used
# when your application is ready to run
# and it tells the code to keep displaying
vin.mainloop()'''
from tkinter import*

vin=Tk()
vin.title("VINAY")
vin.geometry('300x300')


lbl=Label(vin,text="HI How are you all !")
lbl.grid()

'''frame=Frame(vin)
frame.pack()'''

txt=Entry(vin,width=40)
txt.grid(column=1,row=1)

button=Button(vin,text='Geek',bg='green',fg='yellow')
button.grid()

menu=Menu(vin)
item=Menu(menu)
item.add_command(label='New')
item.add_command(label='Open')
item.add_command(label='Search')
item.add_command(label='Close')
menu.add_cascade(label='File',menu=item)
vin.config(menu=menu)

vin.mainloop()




