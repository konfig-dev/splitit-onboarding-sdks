import { Splitit } from "./index";
it("simple operation started", async () => {
  const oauthClientId = process.env.ONBOARDING_SPLITIT_CLIENT_ID;
  const oauthClientSecret = process.env.ONBOARDING_SPLITIT_CLIENT_SECRET;

  const splitit = new Splitit({ oauthClientId, oauthClientSecret });
  const result = await splitit.data.getCountries();
  expect(result).not.toBeNull();
});
