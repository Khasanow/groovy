File myFile=new File("data1.txt")
myFile.write("This is line 1")
myFile<<"\nThis is Line 2"
//myFile.text="This is Line 3"
myFile.withWriter {writer->
    writer.writeLine("This is Line 4")
}
myFile.append("\nThis is Line 4")
println(myFile.length())
println(myFile.isFile())
println(myFile.isDirectory())
println(myFile.isHidden())
def newFile=new File("data2.txt")
newFile<<myFile.text
myFile.bytes=[]
myFile.renameTo(new File("newFile.txt"))
myFile.delete()
println(myFile.text)

