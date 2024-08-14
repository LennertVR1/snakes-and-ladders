package com.lennertvr;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class SnakesAndLaddersTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(SnakesAndLadders.class);
		RuneLite.main(args);
	}
}