import api.Api;
import b.Provider;

module module.b {
	requires module.api;

	provides Api with Provider;
}
