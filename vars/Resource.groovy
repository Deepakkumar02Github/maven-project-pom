def call() {
    def content = libraryResource 'script.bat'

    writeFile file: 'prog.bat', text: content

    bat 'dir prog.bat'
    bat 'call prog.bat'
}
