# rock-paper-scissors
A rock, paper, scissors implementation using the strategy design pattern.

It is also worth noting that this project is also an interesting candidate for genetic algorithms. I have not included a genetic solution to the problem, but I thought it was worth sharing. Instead of implementing a naive 'random choice' player we could implement a genetic algorithm strategy. Each turn would represent a 'generation' of the algorithm. We assign a 'fitness' value to the algorithm. This allows us to measure how successful that generation was. In this case, a 'win' would have the highest fitness value, while a 'loss' would have the lowest. The genes with a high fitness survive and are included in the next generation.

A fun example of this can be found here: http://www.blprnt.com/smartrockets/

In the above example a rocket's fitness is measured by how close to got to the target.
