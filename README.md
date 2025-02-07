# Console File Explorer
#### https://github.com/TheoEversdijk/sde-program

Dit programma is een console-gebaseerde bestandsverkenner waarmee gebruikers bestanden kunnen openen, verwijderen en hernoemen.

Dit programma is ontwikkeld met drie verschillende design patterns, elk uit een afzonderlijke categorie:

* **Composite Pattern (Structural)**<br>
De Composite Pattern groepeert objecten in een boomstructuur, waarin individuele objecten op dezelfde manier behandeld kunnen worden.<br>
In deze applicatie is dit toegepast door de FileSystemComponent abstract class, waar de File en Directory classes van erven. 


* **Factory Method Pattern (Creational)**<br>
De Factory Method Pattern laat het instantiëren van objecten gedaan worden door sub-classes.<br>
In deze applicatie is dit toegepast door de FileOperationFactory, dat op basis van de user-input een Command object creëert.


* **Command Pattern (Behavioral)**<br>
Bij de Command Pattern worden requests als zelfstandige objecten behandeld.<br>
In deze applicatie implementeren de classes OpenFileCommand, DeleteFileCommand en RenameFileCommand de FileOperation interface.

Deze applicatie is ontwikkeld voor de cursus Software Design (CU75020V3). Met toestemming van Andries Nieuwenhuize heb ik deze opdacht zelfstandig uitgevoerd. 