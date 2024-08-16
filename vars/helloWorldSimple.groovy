def call(Map config = [ : ]) {
  sh "echo Hello World ${name}. It is ${dayOfWeek}."
}
