package com.fiftyprojects.abusejet;

import java.util.ArrayList;
import java.util.Arrays;

public class Configuration {
	private ArrayList<String> memcached = new ArrayList<String>();
	private ArrayList<Tracked> tracked = new ArrayList<Tracked>();
	private ArrayList<Blocks> blocks = new ArrayList<Blocks>();
	private Boolean status = true;
	private Boolean tarpit = true;
	private Boolean alerts = true;
	private int alertFrequency = 300;
	

	public Configuration(){
		
	}

	public Configuration(String[] memcached, Tracked[] tracked, Blocks[] blocks, Boolean status, Boolean tarpit) {
		super();
		this.memcached = (ArrayList<String>) Arrays.asList(memcached);
		this.tracked = (ArrayList<Tracked>) Arrays.asList(tracked);
		this.blocks = (ArrayList<Blocks>) Arrays.asList(blocks);
		this.status = status;
		this.tarpit = tarpit;
	}
	
	public Configuration(String[] memcached, Tracked[] tracked, Blocks[] blocks) {
		super();
		this.memcached = (ArrayList<String>) Arrays.asList(memcached);
		this.tracked = (ArrayList<Tracked>) Arrays.asList(tracked);
		this.blocks = (ArrayList<Blocks>) Arrays.asList(blocks);
	}
	
	public Configuration(String[] memcached, Tracked[] tracked) {
		super();
		this.memcached = (ArrayList<String>) Arrays.asList(memcached);
		this.tracked = (ArrayList<Tracked>) Arrays.asList(tracked);
	}
	
	public Tracked getTracked(String name){
		for(Tracked t: tracked){
			if(t.getName().equals(name)){
				return t;
			}
		}
		return null;
	}
	
	public Blocks getBlock(String type, String val){
		for(Blocks b: blocks){
			if(b.getType().equals(type) && b.getValue().equals(val)){
				return b;
			}
		}
		return null;
	}


	public ArrayList<Blocks> getBlocks() {
		return blocks;
	}

	public void setBlocks(ArrayList<Blocks> blocks) {
		this.blocks = blocks;
	}
	
	
	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Boolean getTarpit() {
		return tarpit;
	}

	public void setTarpit(Boolean tarpit) {
		this.tarpit = tarpit;
	}

	public void setAlertFrequency(int alertFrequency) {
		this.alertFrequency = alertFrequency;
	}

	public int getAlertFrequency() {
		return alertFrequency;
	}

	public void setAlerts(Boolean alerts) {
		this.alerts = alerts;
	}

	public Boolean getAlerts() {
		return alerts;
	}

	public ArrayList<String> getMemcached() {
		return memcached;
	}

	public void setMemcached(ArrayList<String> memcached) {
		this.memcached = memcached;
	}

	public ArrayList<Tracked> getTracked() {
		return tracked;
	}

	public void setTracked(ArrayList<Tracked> tracked) {
		this.tracked = tracked;
	}

	
}
