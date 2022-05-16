/*reading files*/
String filePath="data1.txt"// C:\Users\gpbuser\IdeaProjects\gr\src
File myFile=new File(filePath)
//reading entire content as String
println(myFile.text)
println("----------------------------------------------")
//cellect lines into a list
def list=myFile.collect{it}
println("list : $list")
println("----------------------------------------------")
//store file content in an array
def array=myFile as String[]
println("array : $array")
println("----------------------------------------------")
//049 227 80
//read file into a list of string
def lines=myFile.readLines()
println("lines : $lines")
println("----------------------------------------------")
//read life line by line
myFile.eachLine {line->
    println("line:$line")
}
println("----------------------------------------------")
//readf file line by line with line no
def lineNoRange=2..4
def lineList=[]
myFile.eachLine {line, lineNo->
    if (lineNoRange.contains(lineNo)){
        lineList.add(line)

    }
//    println("$lineNo:$line")
}
println("lineList:$lineList")
println("----------------------------------------------")
//read with reader
def line
        myFile.withReader{reader->
        while ((line = reader.readLine())!=null) {
            println("line:$line")
        }
}
println("----------------------------------------------")
//reading with new reader
def outputFile="data2.txt"
def reader=myFile.newReader()
new File(outputFile).append(reader)
reader.close()
println("----------------------------------------------")
//when working with binary, read content as bytes
byte[] contents=myFile.bytes
println(contents)
println("----------------------------------------------")
//size in bytes
println(myFile.length())
println("----------------------------------------------")
//check if is a file or dir
println myFile.isFile()
println myFile.isDirectory()
println("----------------------------------------------")
//get list of files from a dir
new File("C:/Users/gpbuser").eachFile {files->
    println(files.getAbsolutePath())
}
println("----------------------------------------------")
//recursively display all files in a dir & its sub-dir
new File("C:/Users/gpbuser").eachFileRecurse {file->
    println(file.getAbsolutePath())
}
println("----------------------------------------------")
//copy file data to another file
def newFile=new File("data3.txt")
newFile<<myFile.text
println("----------------------------------------------")
//delete file
newFile.delete()


