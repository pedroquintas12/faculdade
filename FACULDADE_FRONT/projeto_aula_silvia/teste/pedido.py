import tkinter
from tkinter import messagebox

root = tkinter.Tk()
root.withdraw()

count = 0
msg_box = messagebox.showwarning("AVISO","VOCÊ FOI HACKEADO")
if msg_box == 'ok':
    msg_box = messagebox.showwarning("AVISO", "PARAR EU SAIR DO SEU PC VC PRECISA ME RESPONDER UMA COISA")

if msg_box == 'ok':
    msg_box = messagebox.askquestion("IAI?","CUZINHO HJ??")

while msg_box == 'no':
    count+=1
    msg_box = messagebox.askquestion("IAI?","CUZINHO HJ??")
    if (count == 5):
        msg_box=messagebox.showerror("AVISO","ESCOLHA ERRADA")
        break

if msg_box=='yes':
    msg_box = messagebox.showinfo("AVISO","SE PREPARE")
