package fcu.iecs.oop.pokemon;

public class GYM {

	public static void fight(Player...players)
	{
		Player[] player = new Player[2];
		int i=0,j=0,one=0,two=0;
		for(Player aplayer:players)
		{
			player[i]= aplayer;
			i++;
		}
		Pokemon[] one_pokemon = new Pokemon[3];
		Pokemon[] two_pokemon = new Pokemon[3];
		one_pokemon = player[0].getPokemons();
		two_pokemon = player[1].getPokemons();
		while(j<3)
		{
			if(one_pokemon[j].getType()==PokemonType.FIRE)
			{
				if(two_pokemon[j].getType()==PokemonType.GRASS)
					one++;
				else if(two_pokemon[j].getType()==PokemonType.WATER)
					two++;
				else
				{
					if(one_pokemon[j].getCp()>two_pokemon[j].getCp())
						one++;
					else if(one_pokemon[j].getCp()<two_pokemon[j].getCp())
						two++;
					else
					{
						int a = (int)(Math.random()*10+1);
						if(a%2==0)
							one++;
						else
							two++;
					}
				}
			}
			else if(one_pokemon[j].getType()==PokemonType.GRASS)
			{
				if(two_pokemon[j].getType()==PokemonType.WATER)
					one++;
				else if(two_pokemon[j].getType()==PokemonType.FIRE)
					two++;
				else
				{
					if(one_pokemon[j].getCp()>two_pokemon[j].getCp())
						one++;
					else if(one_pokemon[j].getCp()<two_pokemon[j].getCp())
						two++;
					else
					{
						int a = (int)(Math.random()*10+1);
						if(a%2==0)
							one++;
						else
							two++;
					}
				}
			}
			else
			{
				if(two_pokemon[j].getType()==PokemonType.FIRE)
					one++;
				else if(two_pokemon[j].getType()==PokemonType.GRASS)
					two++;
				else
				{
					if(one_pokemon[j].getCp()>two_pokemon[j].getCp())
						one++;
					else if(one_pokemon[j].getCp()<two_pokemon[j].getCp())
						two++;
					else
					{
						int a = (int)(Math.random()*10+1);
						if(a%2==0)
							one++;
						else
							two++;
					}
				}
			}
			j++;
		}
		if(one>two)
		{
			player[0].setLevel(player[0].getLevel());
			System.out.println("Winner is "+player[0].getPlayerName()+", and level becomes "+player[0].getLevel());
			//return player[0];
		}
		else
		{
			player[1].setLevel(player[1].getLevel());
			System.out.println("Winner is "+player[1].getPlayerName()+", and level becomes "+player[1].getLevel());
			//return player[1];
		}
	}
}
