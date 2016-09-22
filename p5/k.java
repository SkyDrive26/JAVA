CREATE TABLE `project_kookplaat`.`leden` ( `ID` INT NOT NULL AUTO_INCREMENT , `NAAM` CHAR NOT NULL , `STUDNR` INT NOT NULL , `KLAS` CHAR NOT NULL , PRIMARY KEY (`ID`))

CREATE TABLE `project_kookplaat`.`user_stories` ( `ID` INT(255) NOT NULL AUTO_INCREMENT , `F` INT(100) NOT NULL COMMENT 'feature nr.' , `U` TEXT NOT NULL COMMENT 'user story (max 3000 char)' , `P` CHAR(1) NOT NULL COMMENT 'Priority' , PRIMARY KEY (`ID`))

CREATE TABLE `project_kookplaat`.`features` ( `ID` INT(255) NOT NULL AUTO_INCREMENT , `DEF` TEXT NOT NULL COMMENT 'feature definition' , PRIMARY KEY (`ID`))

CREATE TABLE `project_kookplaat`.`to_do` ( `ID` INT(255) NOT NULL AUTO_INCREMENT , `DEF` TEXT NOT NULL , `F` INT(255) NOT NULL , `U` INT(255) NOT NULL , PRIMARY KEY (`ID`))


INSERT INTO `leden` (`ID`, `NAAM`, `STUDNR`, `KLAS`) VALUES (NULL, 'Daan van Bennekom', '0888249', 'TI1D'), (NULL, 'Reuben Domacasse', '0918901', 'TI1D'), (NULL, 'Tian Dias', '0919603', 'TI1D'), (NULL, 'Huip van den Ende', '0906768', 'TI1D'), (NULL, 'Koosha Ghotb Razmjou', '0853734', 'TI1D')

INSERT INTO `features` (`ID`, `DEF`) VALUES (NULL, 'Iedere kookplaat heeft 4 pitten, een aan/uit knop, een pit-selectie knop, een regelknop voor hogere/lagere temperatuur en een kinderslot.'), (NULL, 'Op een LED display wordt de actuele situatie van de kookplaat weergegeven.'), (NULL, 'Er zijn twee (identieke) kookplaten die centraal aangestuurd worden door 1 controller.'), (NULL, 'Documentatie/Bewijsmateriaal')

INSERT INTO `user_stories` (`ID`, `F`, `U`, `P`) VALUES (NULL, '4', 'Als scrum team wil ik een samenwerkingsovereenkomst, zodat ik weet wat ik aan mezelf en mijn team heb.', 'm'), (NULL, '3', 'Als gebruiker wil ik met één bedieningsmodule 2 kookplaten aan kunnen sturen, zodat het systeem makkelijk in gebruik is.', 'm'), (NULL, '1', 'Als gebruiker wil ik de kookplaat kunnen beveiligen, zodat deze veilig gebruikt kan worden in de buurt van kinderen.', 'm'), (NULL, '4', 'Als voorzitter wil ik per vergadering een notulist zodat er een notulen wordt bijgehouden.', 'm'), (NULL, '2', 'Als gebruiker wil ik op een display kunnen aflezen op welke stand de kookplaat staat, zodat ik kan zien wat de huidige verhittingsstand is.', 'm') 

