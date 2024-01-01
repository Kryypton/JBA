# JBA - JAVA Battle.net API

## Présentation du Projet

JBA - JAVA Battle.net API est une API JAVA permettant de récupérer des informations sur les jeux de Blizzard. Elle est basée sur l'API REST de Blizzard, et permet de récupérer des informations sur les jeux de Blizzard, comme World of Warcraft, Diablo 3, Starcraft 2, Hearthstone, Heroes of the Storm et Overwatch. Pour l'instant elle ne permet que de récupérer son token mais des mises à jour sont prévues.

## Technologies Utilisées

- Java: Langage de programmation principal.
- Maven: Outil de gestion et d'automatisation de projet.
- JUnit: Cadre de test pour des tests unitaires rigoureux. (non apparent dans le dépôt

## Utilisation de la librairie

Exemple pour la récupération du Token d'accès :
```
    public static void main(String[] args) {
        JBA jba = JBABuilderOAuth.createOAuthAccess("937e03d32a5b47a4b20035dd343ca591", "eLepPcWN1ixcEbEQPGVL1Krmj8AXRxn8", JBAServerLocales.FR).build();
        JBAService service = jba.getService();
        Guild guild = service.getGuild("Hyjal", "Gardiens éternels").getData();
        System.out.println(guild.getName() + ": " + guild.getFaction().getName() + " - " + guild.getRealm().getName() + " - " + guild.getMemberCount());
        GuildRoster gR = (GuildRoster) service.getRessource(guild.getRoster().getHref(), GuildRoster.class).getData();
        Character c = service.getRessource(gR.getMembers().get(0).getCharacter().getKey().getHref(), Character.class).getData();
        System.out.println(c.getName());
    }
```
