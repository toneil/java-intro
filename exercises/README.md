# Exercise: Members of Parliament

## Specifications

In the file mps.csv is a list of roughly 1600 Swedish MPs on the format `<NAME>,<PARTY>,<CONSTITUENCY>` (with ASCIIfied names - no å,ä,ö etc.).
Using this list, your task is to build a command line search tool with the following behaviour:
- `>java mp` should return all names in the list
- `>java mp -n Goran` should return a list of all MPs with names containing 'Goran'
- `>java mp -p FP` should return a list of all MPs belonging to the party FP (Folkpartiet)
- `>java mp -c Stockholms Kommun` should return a list of all MPs running in the constituency of Stockholm
- `>java mp -f output.txt` should write the results to `output.txt` (and not return anything to the terminal)
- You should be able to use multiple flags, e.g. `>java mp -p S -n Persson -c Sodermanlands lan` should return former Prime Minister Göran Persson.

## Code guidelines

Try to make the internal model of the data clear and informative: Don't just make a single big list of all the data - represent MPs, parties etc. as classes and objects.

