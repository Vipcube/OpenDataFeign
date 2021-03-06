package tw.fondus.openfeign.cwb.weather.v1.dto.rainfall;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

/**
 * The JSON model of rainfall location.
 * 
 * @author Chao
 *
 */
@Data
@SuperBuilder
@NoArgsConstructor
public class Location {
	@JsonProperty( "lat" )
	private String lat;
	
	@JsonProperty( "lon" )
	private String lon;
	
	@JsonProperty( "locationName" )
	private String locationName;
	
	@JsonProperty( "stationId" )
	private String stationId;
	
	@JsonProperty( "time" )
	private Time time;
	
	@JsonProperty( "weatherElement" )
	private List<WeatherElement> weatherElements;
	
	@JsonProperty( "parameter" )
	private List<Parameter> parameters;
}
