import { Configuration, DataApi } from "./";
it("simple operation started", async () => {
  const oauthClientId = process.env.SPLITIT_CLIENT_ID;
  const oauthClientSecret = process.env.SPLITIT_CLIENT_SECRET;

  const config = new Configuration({ oauthClientId, oauthClientSecret });
  const api = new DataApi(config);
  const result = await api.getCountries();
  expect(result).not.toBeNull();
});
